sealed class Manager permits SalesManager, MarketingManager, GlobalManager{
	int x = 10;
	public Manager(){
		System.out.println("HI");
	}
}

final class Peon	//extends Manager
{
}

final class SalesManager extends Manager{
}

sealed class MarketingManager extends Manager permits DistributionManager{

}

final class DistributionManager extends MarketingManager{
}

non-sealed class GlobalManager extends Manager{
	
}

class CEO extends GlobalManager{
	
}

public class SealedClass extends GlobalManager{
	public static void main(String[] args){
		GlobalManager gm = new GlobalManager();
		System.out.println(gm.x);
	}
}