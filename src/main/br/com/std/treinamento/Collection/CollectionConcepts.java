package br.com.std.treinamento.Collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class CollectionConcepts {

    public static void main(String[] args){

        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product ("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        final Iterator<Product> productIterator = products.iterator();
         while (productIterator.hasNext()) {
            Product product = productIterator.next();
            if (product.getWeight() > 20)
                System.out.println(product);
            else
            {
                productIterator.remove();
            }
        }
        System.out.println(products);
        System.out.println(products.size());
        System.out.println(products.isEmpty());
        System.out.println(products.contains(door));
        System.out.println(products.contains(window));

        Collection<Product> otherProduct = new ArrayList<>();
        products.removeAll(otherProduct);

        System.out.println(products);
     /*   for(Product product : products){
            System.out.println(product);
        } */

    }

}
