package com.pattern.observer.observer;

import com.pattern.observer.model.Estoque;

public interface Observer {
    public void update(Estoque estoque);
}
