package br.com.std.treinamento.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {

    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    private final List<Product> prodcuts = new ArrayList<>();

    public void add(Product product)
    {
        prodcuts.add(product);
    }

    public void replace(Product oldProduct, Product newProduct)
    {
        final int index = prodcuts.indexOf(oldProduct);
        prodcuts.set(index,newProduct);
    }

    @Override
    public Iterator<Product> iterator() {
        return prodcuts.iterator();
    }
}
