public class Campus {
        private String CampName;
        private String DirectorName;
        private Department[] departments = new Department[10];

        public String getCampName() {
                return CampName;
        }

        public void setCampName(String campName) {
                this.CampName = campName;
        }

        public String getDirectorName() {
                return DirectorName;
        }

        public void setDirectorName(String directorName) {
                this.DirectorName = directorName;
        }

        public Department[] getDepartments() {
                return departments;
        }

        public void setDepartments(Department[] departments) {
                this.departments = departments;
        }
}
