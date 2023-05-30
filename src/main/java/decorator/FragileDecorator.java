package decorator;

public class FragileDecorator extends Decorator{
    @Override
    public Integer getCost() {
        return 300+ iSpecialService.getCost();
    }

    public FragileDecorator(ISpecialService specialService) {
        this.iSpecialService=specialService;
    }
}
