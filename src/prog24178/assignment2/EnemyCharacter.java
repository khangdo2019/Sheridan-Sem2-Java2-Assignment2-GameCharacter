/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog24178.assignment2;

/**
 *
 * @author Khang Do
 */
public class EnemyCharacter extends NonPlayableGameCharacter 
        implements BattleStats{
    private int attackPower;
    private int defensePower;
    private int hitPoints;
    private int speed;
    
    public EnemyCharacter(){
        super();
    }
    
    @Override
    public void speak(){
        
    }
    
    @Override
    public void attack(GameCharacter g){
        
    }
}
