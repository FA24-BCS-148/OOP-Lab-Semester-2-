public class Computers{
	private String cpu;
	private int ramSize;
	private int driveSpace;
	private String sysID;
	private String LCDmodel;

	public Computers(String cpu, int ramSize, int driveSpace, String sysID, String LCDmodel){
		this.cpu = cpu;
		this.ramSize = ramSize;
		this.driveSpace = driveSpace;
		this.sysID = sysID;
		this.LCDmodel = LCDmodel;
	}

	public void setCpu(String ncpu){
		cpu = ncpu;
	} 

	public void setRamSize(int nRamSize){
		ramSize = nRamSize;
	} 

	public void setDriveSpace(int nDriveSpace){
		driveSpace = nDriveSpace;
	} 

	public void setID(String nSysID){
		sysID = nSysID;
	} 

	public void setLCDmodel(String nLCDmodel){
		LCDmodel = nLCDmodel;
	}

	public String getCpu(){
		return cpu;
	}

	public int getRamSize(){
		return ramSize;
	}

	public int getDriveSpace(){
		return driveSpace;
	}
	
	public String getSystemID(){
		return sysID;
	}

	public String getLCDmodel(){
		return LCDmodel;
	}
}