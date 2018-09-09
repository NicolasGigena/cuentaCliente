package vistas.interfaces;

public interface IvistaAltaClientesInterface {

    public abstract void limpiarErrores();

    public abstract void LimpiarInputText();

    public abstract void setErrorNombre(String error);

    public abstract void setErrorApellido(String error);

    public abstract void setErrorDni(String error);

    public abstract void setErrorFondoInicial(String error);

    public abstract void mensajeGuardadoConExito();
}
