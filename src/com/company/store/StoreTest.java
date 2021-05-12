package com.company.store;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeoutException;

public class StoreTest {

    @Test
    public void calcularCostoSinProductosTest(){
        //AAA
        //Arrange
        Store tienda = new Store();

        int expected =0;

        //Act
        int actual = tienda.calcularCostoTotal();

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calcularCostoTotalTest() {
        //AAA
        //Arrange
        Store tienda = new Store();
        int expected =12;

        tienda.agregarProducto("Pan",1);
        tienda.agregarProducto("Fideos",5);
        tienda.agregarProducto("Bolsa de leche",6);

        //Act
        int actual = tienda.calcularCostoTotal();

        //Assert
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void calcularCostoTotalRemoviendoProductoTest(){
        ///AAA
        //Arrange
        Store tienda =  new Store();
        int expected = 12;

        tienda.agregarProducto("Pan",1);
        tienda.agregarProducto("Fideos",5);
        tienda.agregarProducto("Bolsa de leche",6);

        tienda.eliminarProducto("Pan");

        //Act
        int actual = tienda.calcularCostoTotal();

        //Assert
        Assert.assertEquals(expected, actual);
    }
}
