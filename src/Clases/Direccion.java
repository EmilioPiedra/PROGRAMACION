package Clases;

public class Direccion {
    int id ;
     String numero;
     String calle1;
     String calle2;
     int actual;

    public Direccion() {
    }

    public Direccion(int id, String numero, String calle1, String calle2, int actual) {
        this.id = id;
        this.numero = numero;
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.actual = actual;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCalle1(String calle1) {
        this.calle1 = calle1;
    }

    public void setCalle2(String calle2) {
        this.calle2 = calle2;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    public int getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public String getCalle1() {
        return calle1;
    }

    public String getCalle2() {
        return calle2;
    }

    public int getActual() {
        return actual;
    }
}
