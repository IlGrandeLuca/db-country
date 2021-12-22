/**
 * 
 */
package org.generation.italy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author lucai
 *
 */
public class Main {

	private final static String DB_URL = "jdbc:mysql://localhost:3306/nations";
	private final static String DB_USER = "root";
	private final static String DB_PASSWORD = "rootpassword";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {

			Scanner in = new Scanner(System.in);
			System.out.println("Enter country id: ");
			int id = Integer.parseInt(in.nextLine());

			Country c = selectCountryById(con, id);

			if (c.getnDay().equals(null)) {

				LocalDate date = LocalDate.of(1861, 03, 17);
				c.setnDay(date);
				updateCountry(con, c);
			}

			System.out.println(c);
			in.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	private static Country selectCountryById(Connection con, int id) throws SQLException {

		String sel = "SELECT * FROM countries WHERE country_id = ?";
		try (PreparedStatement psCountry = con.prepareStatement(sel)) {

			psCountry.setInt(1, id);
			try (ResultSet rsCountry = psCountry.executeQuery()) {

				LocalDate date;
				if (rsCountry.next()) {
					if (rsCountry.getDate(4) != null) {
						date = null;
					} else {
						date = rsCountry.getDate(4).toLocalDate();
					}
					Country c = new Country(rsCountry.getInt(1), rsCountry.getString(2), rsCountry.getInt(3), date,
							rsCountry.getInt(5), rsCountry.getInt(6), rsCountry.getInt(7));
					return c;
				} else
					return null;
			}
		}
	}

	private static void updateCountry(Connection con, Country c) throws SQLException {

		String update = "UPDATE countries SET country_id = ?, name = ?, area = ?, national_day = ?, country_code2 = ?, country_code3 = ?, region_id = ? WHERE country_id = ?;";
		try (PreparedStatement psCountry = con.prepareStatement(update)) {
			psCountry.setInt(8, c.getCountryId());
			psCountry.setInt(1, c.getCountryId());
			psCountry.setString(2, c.getName());
			psCountry.setInt(3, c.getArea());
			psCountry.setDate(4, java.sql.Date.valueOf(c.getnDay()));
			psCountry.setInt(5, c.getCountryCode2());
			psCountry.setInt(6, c.getCountryCode3());
			psCountry.setInt(7, c.getRegionId());
			int result = psCountry.executeUpdate();

		}
	}
}
