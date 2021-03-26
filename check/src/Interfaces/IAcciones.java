package Interfaces;

import exceptions.ExceptionCustom;

public interface IAcciones {
    void agregar(Object obj) throws ExceptionCustom;

    Object buscar(Object obj);

    void quitar(Object obj) throws ExceptionCustom;
}
