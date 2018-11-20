/**
 * This is a subclass derived from Electronic,
 * @author Ahmet Melih Tanriyakul
 * @version 1.8.0 121
 * */
public class Computer extends Electronic{
	private String sOP;
	private String sCPUType;
	private int iRamCapacity;
	private int iHDDCapacity;
	
	public String getsOP() {
		return sOP;
	}
	public void setsOP(String sOP) {
		this.sOP = sOP;
	}
	public String getsCPUType() {
		return sCPUType;
	}
	public void setsCPUType(String sCPUType) {
		this.sCPUType = sCPUType;
	}
	public int getiRamCapacity() {
		return iRamCapacity;
	}
	public void setiRamCapacity(int sRamCapacity) {
		this.iRamCapacity = sRamCapacity;
	}
	public int getiHDDCapacity() {
		return iHDDCapacity;
	}
	public void setiHDDCapacity(int sHDDCapacity) {
		this.iHDDCapacity = sHDDCapacity;
	}
	

}
