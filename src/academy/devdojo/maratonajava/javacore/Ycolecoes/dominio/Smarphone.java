package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class Smarphone {
    private String serialNumber;
    private String marca;

    public Smarphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    // Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    // Simétrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
    // Transitividade: para x,y,z diferentes de null se x.equals(y) == true, e x.equals(z) == true logo y.equals(z) == true
    // Consistente: x.equals(x) sempre retorna true se x for diferente de null
    // Para x diferente de null, x.equals(null) tem que retornar false.
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        // Tendo certeza com as verificações anteriores, podemos fazer o Cast para o objeto desejado(Smartphone)
        Smarphone smarphone = (Smarphone) obj;
        return serialNumber != null && serialNumber.equals(smarphone.serialNumber);
    }
    // se x.equals(y) == true, y.hashCode() == x.hashCode()
    // y.hashCode() == x.hashCode() nao necessariamente o equals de y.equals(x) == true
    // x.equals(y) == false, x.hashCode() diferente de y.hashCode()
    // y.hashCode() != x.hashCode(), x.equals(y) devera ser false
    @Override
    public int hashCode() {
        if(serialNumber == null){
            return 0;
        }
        return this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smarphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
