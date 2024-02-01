package hw7;

public class Hw7ex3 {
    public static class Konspet {
        private String studentName;
        private String subjectName;
        private int pageCount;
        private int yearOfPublication;
        private String coverColor;
        private String institutionName;

        public Konspet(String studentName, String subjectName, int pageCount, int yearOfPublication, String coverColor, String institutionName) {
            this.studentName = studentName;
            this.subjectName = subjectName;
            this.pageCount = pageCount;
            this.yearOfPublication = yearOfPublication;
            this.coverColor = coverColor;
            this.institutionName = institutionName;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public String getSubjectName() {
            return subjectName;
        }

        public void setSubjectName(String subjectName) {
            this.subjectName = subjectName;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getYearOfPublication() {
            return yearOfPublication;
        }

        public void setYearOfPublication(int yearOfPublication) {
            this.yearOfPublication = yearOfPublication;
        }

        public String getCoverColor() {
            return coverColor;
        }

        public void setCoverColor(String coverColor) {
            this.coverColor = coverColor;
        }

        public String getInstitutionName() {
            return institutionName;
        }

        public void setInstitutionName(String institutionName) {
            this.institutionName = institutionName;
        }

    }


}
