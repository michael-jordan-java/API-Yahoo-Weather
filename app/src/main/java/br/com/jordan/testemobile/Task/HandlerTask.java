package br.com.jordan.testemobile.Task;

/**
 * Created by User on 20/09/2017.
 */

public interface HandlerTask {
    void onPreHandle();
    void onSuccess(String retorno);
    void onError(Exception error);
}
