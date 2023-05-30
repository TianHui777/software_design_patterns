package decorator;

public class UrgentDecorator extends Decorator{
    @Override
    public Integer getCost() {
        return 100+iSpecialService.getCost();
    }

    public UrgentDecorator(ISpecialService specialService) {
        this.iSpecialService=specialService;
    }
}
