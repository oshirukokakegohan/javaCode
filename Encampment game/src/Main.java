public class Main {
	public static void main(String[] args) {
		Map map = new Map();
		RightPlayer rightPlayer = new RightPlayer();
		LeftPlayer leftPlayer = new LeftPlayer();
	
		System.out.println(map.getMap());
		System.out.println("左のプレイヤーのコインは＠、右のプレイヤーのコインは＄です");
		System.out.println("上と下のレーンは、それぞれ別のレーンです");
		System.out.println("1ターンにつき1回、上下どちらかのコインを1マス以上動かします");
		System.out.println("枠内であれば左右どちらにどれだけ動かしても構いません");
		System.out.println("ただし相手のコインを飛び越すことはできません");
		System.out.println("両方のレーンで相手を動けなくさせたプレイヤーの勝ちになります");
		
		while(true) {
			leftPlayer.playLeftTurn();
			rightPlayer.playRightTurn();
		}
	}
}

