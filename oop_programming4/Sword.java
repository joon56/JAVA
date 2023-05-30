package oop_programming4;

public class Sword extends Weapon
{
    private double sharpness;
    private double deltaSharpness;

    public Sword()
    {
        sharpness = 1.0;
        deltaSharpness = 0.05;
    }

    @Override
    public void generateAttackPoint()
    {
        int damage = (int)(Math.random() * getMaximumAttackPoint()) + 1;

        System.out.println("Slashing the sword...");
        System.out.println("Opponent damage will be " + damage + " with blade sharpness " + sharpness);
    }

    @Override
    public void applyWeaponUse()
    {
        System.out.println("Blade sharpness degraded by " + deltaSharpness);
        sharpness -= deltaSharpness;
    }

    @Override
    public void printStatus()
    {
        System.out.println("Blade sharpness : " + sharpness);
    }

    /* getters and setters */

    public double getSharpness()
    {
        return sharpness;
    }

    public void setSharpness(double s)
    {
        sharpness = s;
    }

    public double getDeltaSharpness()
    {
        return deltaSharpness;
    }

    public void setDeltaSharpness(double d)
    {
        deltaSharpness = d;
    }

}
