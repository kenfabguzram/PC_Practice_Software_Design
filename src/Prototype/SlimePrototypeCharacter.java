package Prototype;


public class SlimePrototypeCharacter implements NewCloneCharacter {
    private String atributo1;
    private String atributo2;
    private String atributo3;

    public SlimePrototypeCharacter(String atributo1, String atributo2, String atributo3) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    @Override
    public SlimePrototypeCharacter clone() {
        return new SlimePrototypeCharacter(this.atributo1, this.atributo2, this.atributo3);
    }

    @Override
    public void doSomething() {
    }

    public void metodo1() {
    }

    public void metodo2() {
    }
    
 // Getter for atributo1
    public String getAtributo1() {
        return atributo1;
    }

    // Setter for atributo1
    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    // Getter for atributo2
    public String getAtributo2() {
        return atributo2;
    }

    // Setter for atributo2
    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }

    // Getter for atributo3
    public String getAtributo3() {
        return atributo3;
    }

    // Setter for atributo3
    public void setAtributo3(String atributo3) {
        this.atributo3 = atributo3;
    }

}
