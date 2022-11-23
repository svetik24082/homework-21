package product;

import java.util.Objects;

public class Product {
    private final String nameProducts;
    private final double price;


    public Product(String nameProducts, double price) {
        if (nameProducts == null || nameProducts.isBlank() || price < 0) {
            throw new IllegalArgumentException(" Заполните карточку товара полностью");
        }
        this.nameProducts = nameProducts;
        this.price = price;
    }


    public String getNameProducts() {
        return nameProducts;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(nameProducts, product.nameProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProducts);
    }


    @Override
    public String toString() {
        return "Product{" +
                "nameProducts='" + nameProducts + '\'' +
                ", price=" + price +
                '}';
    }
}


