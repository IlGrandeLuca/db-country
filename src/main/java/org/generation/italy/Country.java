/**
 * 
 */
package org.generation.italy;

import java.time.LocalDate;

/**
 * @author lucai
 *
 */
public class Country {

	private int countryId;
	private String name;
	private int area;
	private LocalDate nDay;
	private int countryCode2;
	private int countryCode3;
	private int regionId;

	/**
	 * @param countryId
	 * @param name
	 * @param area
	 * @param nDay
	 * @param countryCode2
	 * @param countryCode3
	 * @param regionId
	 */
	public Country(int countryId, String name, int area, LocalDate nDay, int countryCode2, int countryCode3,
			int regionId) {
		this.countryId = countryId;
		this.name = name;
		this.area = area;
		this.nDay = nDay;
		this.countryCode2 = countryCode2;
		this.countryCode3 = countryCode3;
		this.regionId = regionId;
	}

	/**
	 * @return the countryId
	 */
	public int getCountryId() {
		return countryId;
	}

	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the area
	 */
	public int getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(int area) {
		this.area = area;
	}

	/**
	 * @return the nDay
	 */
	public LocalDate getnDay() {
		return nDay;
	}

	/**
	 * @param nDay the nDay to set
	 */
	public void setnDay(LocalDate nDay) {
		this.nDay = nDay;
	}

	/**
	 * @return the countryCode2
	 */
	public int getCountryCode2() {
		return countryCode2;
	}

	/**
	 * @param countryCode2 the countryCode2 to set
	 */
	public void setCountryCode2(int countryCode2) {
		this.countryCode2 = countryCode2;
	}

	/**
	 * @return the countryCode3
	 */
	public int getCountryCode3() {
		return countryCode3;
	}

	/**
	 * @param countryCode3 the countryCode3 to set
	 */
	public void setCountryCode3(int countryCode3) {
		this.countryCode3 = countryCode3;
	}

	/**
	 * @return the regionId
	 */
	public int getRegionId() {
		return regionId;
	}

	/**
	 * @param regionId the regionId to set
	 */
	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", " + (name != null ? "name=" + name + ", " : "") + "area=" + area
				+ ", " + (nDay != null ? "nDay=" + nDay + ", " : "") + "countryCode2=" + countryCode2
				+ ", countryCode3=" + countryCode3 + ", regionId=" + regionId + "]";
	}
}
