/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author swathisharma
 */
public class CarHistory {
    
    private ArrayList<CarDetails> history;
    
    public CarHistory(){
        this.history = new ArrayList<CarDetails>();
    }

    public ArrayList<CarDetails> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<CarDetails> history) {
        this.history = history;
    }
    
    public CarDetails addNewCar() {
        
        CarDetails newCar = new CarDetails();
        history.add(newCar);
        return newCar;
        
    }
    
    public void deleteCar(CarDetails cd) {
        history.remove(cd);
    }

    public void setPath(String path) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
