package oop_programming4;


public class Bow extends Weapon
{
    private int numberOfArrows;
    private int arrowsCapacity;

    public Bow()
    {
        this(20);
    }
    
    public Bow(int initialArrowsCapacity)
    {
        super();     // maximumAttackPoint with default 100

        arrowsCapacity = initialArrowsCapacity;
        numberOfArrows = arrowsCapacity;
    }

    @Override
    public void generateAttackPoint()
    {
        int damage = (int)(Math.random() * getMaximumAttackPoint()) + 1; // getter�� �����;� ���� ����

        System.out.println("Shooting an arrow...");
        System.out.println("Opponent damage will be " + damage);
    }

    @Override
    public void applyWeaponUse()
    {
        System.out.println("Used up one arrow.");
        numberOfArrows--;	// arrow�� �ϳ� ���� ���� ������ �ϳ� ����.
    }

    @Override
    public void printStatus()
    {
        System.out.println("Bow capacity for arrows: " + arrowsCapacity);
        System.out.println("Currently holds " + numberOfArrows + " arrows");
    }

    /* getters and setters */

    public int getNumberOfArrows()
    {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int n)
    {
        numberOfArrows = n;
    }

    public int getArrowsCapacity()
    {
        return arrowsCapacity;
    }

    public void setArrowsCapacity(int c)
    {
        arrowsCapacity = c;
    }
}
