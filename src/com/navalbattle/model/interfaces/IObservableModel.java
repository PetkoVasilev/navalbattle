package com.navalbattle.model.interfaces;

import java.util.Observer;

public interface IObservableModel {
	public void addObserver(Observer o);
	public void deleteObserver(Observer o);
}
