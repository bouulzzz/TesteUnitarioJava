package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    void doisMaisDoisIgualQuatro() {
        var calculadora = new Calculadora();
        assertEquals(4, calculadora.somar(2, 2));
    }
    @Test
    void doisEMeioMaisDoisEMeioIgualCinco() {
        var calculadora = new Calculadora();
        assertEquals(5, calculadora.somar(2.5, 2.5));
    }
    @Test
    void dezMaisDoisEMeioIgualDozeEMeio() {
        var calculadora = new Calculadora();
        assertEquals(12.5, calculadora.somar(10, 2.5));
    }
    @Test
    void doisMaisMenosCincoIgualMenosTres() {
        var calculadora = new Calculadora();
        assertEquals(-3, calculadora.somar(2, -5));
    }
    @Test
    void doisMenosTresIgualMenosUm() {
        var calculadora = new Calculadora();
        assertEquals(-1, calculadora.subtrair(2, 3));
    }
    @Test
    void doisMenosDoisEMeioIgualMenosMeio() {
        var calculadora = new Calculadora();
        assertEquals(-0.5, calculadora.subtrair(2, 2.5));
    }
    @Test
    void cincoEDoisMenosDoisEDoisIgualTres() {
        var calculadora = new Calculadora();
        assertEquals(3, calculadora.subtrair(5.2, 2.2));
    }
    @Test
    void menosTresMenosDoisIgualCinco() {
        var calculadora = new Calculadora();
        assertEquals(-5, calculadora.subtrair(-3, 2));
    }
    @Test
    void DoisVezesSeisIgualDoze() {
        var calculadora = new Calculadora();
        assertEquals(12, calculadora.multiplicar(2, 6));
    }
    @Test
    void TresVezesMenosTresIgualMenosNove() {
        var calculadora = new Calculadora();
        assertEquals(-9, calculadora.multiplicar(3, -3));
    }
    @Test
    void DoisVezesDoisEMeioIgualCinco() {
        var calculadora = new Calculadora();
        assertEquals(5, calculadora.multiplicar(2, 2.5));
    }
    @Test
    void TresVezesTreseTresIgualNoveENove() {
        var calculadora = new Calculadora();
        assertEquals(3*3.3, calculadora.multiplicar(3, 3.3));
    }
    @Test
    void QuatroDivididoPorDoisIgualDois() {
        var calculadora = new Calculadora();
        assertEquals(2, calculadora.dividir(4, 2));
    }
    @Test
    void CincoDivididoPorDoisIgualDoisEMeio() {
        var calculadora = new Calculadora();
        assertEquals(2.5, calculadora.dividir(5, 2));
    }
    @Test
    void MenosNoveDivididoPorTresIgualMenosTres() {
        var calculadora = new Calculadora();
        assertEquals(-3, calculadora.dividir(-9, 3));
    }
    @Test
    void DezDivididoPorTresIgualDizimaTres() {
        var calculadora = new Calculadora();
        assertEquals((double)10/3, calculadora.dividir(10, 3));
    }
    @Test
    void DezDivididoPorZero() {
        var calculadora = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0));
    }
}