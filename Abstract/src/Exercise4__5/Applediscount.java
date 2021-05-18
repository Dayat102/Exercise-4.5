package Exercise4__5;

class Applediscount implements Discount {

	public float rateofdiscount() {
		return 0.15f;
	}
}

class HoneyCrispdiscount implements Discount {

	public float rateofdiscount() {
		return 0.25f;
	}
}

class Mangodiscount implements Discount {

	public float rateofdiscount() {
		return 0.35f;
	}
}
