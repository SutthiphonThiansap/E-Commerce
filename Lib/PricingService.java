package Lib;
import java.util.ArrayList;
import Lib.*;
import Lib.Discount.DefaultPricingStrategy;
import Lib.Discount.Discountstrategy;
/**
 * คลาสสำหรับจัดการโปรโมชันและคำนวณราคา
 */

public class PricingService 
{
    private record  StrategyRule(String sku, Discountstrategy strategy);
    private final ArrayList<StrategyRule> strategies = new ArrayList<>();
    private final Discountstrategy defDiscountstrategy = new DefaultPricingStrategy();
}
