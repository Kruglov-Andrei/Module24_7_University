public enum StudyProfile {

    MEDICINE("Медицина"),
    ECONOMICS("Экономика"),
    MATHEMATICS("Математика"),
    HISTORY("История"),
    LITERATURE("Литература"),
    PHYSICS("Физика");

    private String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }

    @Override
    public String toString() {
        return "StudyProfile{" + "profileName='" + profileName + '\'' + '}';
    }
}
