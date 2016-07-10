package cl.nonius.core.model;

/**
 * Created by pquintero on 7/10/16.
 */
public class Menu {
    private Integer idMenu;
    private String name;
    private String description;

    public Integer getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static void main(String[] args) {
        System.out.println("hola Mundo !!!");
    }
}
