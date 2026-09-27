package subjects;

import interfaces.*;
import enums.StatusPedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private StatusPedido status;

    @Override
    public void registerObserver(Observer observer) {observers.add(observer);}
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for(Observer obs : observers){
            obs.update(this);
        }
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status){
        this.status = status;
        notifyObservers(); // notificando
        System.out.printf("\n"); // quebra de linha para separar saída
    }
}
