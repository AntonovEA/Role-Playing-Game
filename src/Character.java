public abstract class Character implements Fighter {
    private int hp;
    private int exp;
    private int money;
    private String name;
    private int strength;
    private int dexterity;


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public Character(int hp, int exp, int money, String name, int strength, int dexterity) {
        this.hp = hp;
        this.exp = exp;
        this.money = money;
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
    }

    @Override
    public int attack() {
        if (dexterity * 3 > getRandomValue())
            return strength;
        else {
            return 0;
        }

    }

    private int getRandomValue() {
        return (int) (Math.random() * 100);
    }

    @Override
    public String toString() {
        return String.format("%s здоровье:%d", name, hp);

    }
}

