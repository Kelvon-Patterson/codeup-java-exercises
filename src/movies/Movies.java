package movies;

class Movie {
    private String name;
    private String category;
    //Name Getter
    public String getName(){
        return name;
    }
    //Name Setter
    public void setName(String newName){
        this.name = newName;
    }
    //Category Getter
    public String getCategory(){
        return category;
    }
    //Category Setter
    public void setCategory(String newCategory){
        this.category= newCategory;
    }
    public Movie(String movieName, String category){
        name=movieName;
        category="Unassigned";
    }

    public static void main(String[] args) {

    }
}
