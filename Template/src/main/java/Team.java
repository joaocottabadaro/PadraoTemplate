public abstract class Team {

    private String objective;
    private String equipment;
    private String name;

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }



    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }


    public abstract String getGun();

    public String getTeam() {
        return "Spectator";
    }

    public String getInfoTeam() {
        return "{" +
                "Name=" + this.name +
                ", Gun='" + this.getGun() + '\'' +
                ", equipment=" + this.equipment +
                ", objective=" + this.objective +
                ", team=" + this.getTeam() +
                '}';
    }

}
