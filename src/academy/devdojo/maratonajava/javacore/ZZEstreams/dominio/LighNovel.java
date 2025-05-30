package academy.devdojo.maratonajava.javacore.ZZEstreams.dominio;

import java.util.Objects;

public class LighNovel {
    private String tile;
    private double price;
    private Category category;

    public LighNovel(String tile, double price) {
        this.tile = tile;
        this.price = price;
    }

    public LighNovel(String tile, double price, Category category) {
        this.tile = tile;
        this.price = price;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LighNovel lighNovel = (LighNovel) o;
        return Objects.equals(tile, lighNovel.tile);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tile);
    }

    @Override
    public String toString() {
        return "LighNovel{" +
                "tile='" + tile + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    public Category getCategory() {
        return category;
    }

    public String getTile() {
        return tile;
    }

    public double getPrice() {
        return price;
    }
}
