package com.example.arnoldo.calculadora;

import android.graphics.YuvImage;

/**
 * Created by arnoldo on 14/05/18.
 */

public class ClaseGenerica<T> {//T es el el identificador que se utiliza en los genericos para especificar el tipo de dato

  private T numero;
  private T numero2;

  public  ClaseGenerica(){//constructor vacio propio de la clase

  }
  public void setNumero(T valor1){
    this.numero=valor1;
  }
  public void setNumero2(T valor2){
    this.numero2=valor2;
  }
  public  T getNumero2()
  {
    return numero2;
  }
  public T getNumero(){
    return numero;
  }

}
