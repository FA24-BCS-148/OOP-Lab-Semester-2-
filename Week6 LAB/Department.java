public class Department {
	private Employe HOD;
	private String DepName;
        private Lab[] labs = new Lab[10];
        private Employe LabIncharge;

 	public Department(Employe HOD, String DepName, Lab[] labs, Employe LabIncharge) {
        	this.HOD = HOD;
        	this.DepName = DepName;
        	this.labs = labs;
        	this.LabIncharge = LabIncharge;
	}

        public Employe getHOD() {
                return HOD;
        }

        public void setHOD(Employe HOD) {
                this.HOD = HOD;
        }

        public String getDepName() {
                return DepName;
        }

        public void setDepName(String depName) {
                this.DepName = depName;
        }

        public Lab[] getLabs() {
                return labs;
        }

        public void setLabs(Lab[] labs) {
                this.labs = labs;
        }

        public Employe getLabIncharge() {
		return LabIncharge;
        }

        public void setLabIncharge(Employe labIncharge) {
                this.LabIncharge = labIncharge;
        }
}


