public class RightPlayer extends Player{
	void playRightTurn() {
		start();
		if(select == 0) {
			top();
		}else if(select == 1) {
			bottom();
		}
		if(select == 0) {
			topLeft();
		}else if(select == 1) {
			topRight();
		}else if (select == 2) {
			bottomLeft();
		}else if (select == 3) {
			bottomRight();
		}else if(select == 4) {
			return;
		}
	}

	void start() {
		System.out.println("***右のプレイヤーのターンです***");
		if(map.getLeftPlayerTop() == 17) {
			select = 1;
			return;
		}
		if(map.getLeftPlayerBottom() == 7) {
			select = 0;
			return;
		}
		
		System.out.println();
		System.out.println(map.getMap());
		System.out.println("上のレーンを動かす場合は'0'を、下のレーンを動かす場合は'1'を入力してください");
		String input = scanner.next();
	    
		try{
	    	order = Integer.parseInt(input);
	    }
	    catch(Exception execption){
	    	System.out.println("***数字を入力してください***");
	    	start();
	    }
	   	
		if(order == 0) {
	   		select = 0;
			return;
		}else if(order == 1) {
			select = 1;
			return;
		}else{
			System.out.println("***'0'か'1'を入力してください***");
			start();
		}
	}
	
	void top() {
		if(map.getRightPlayerTop() ==  map.getLeftPlayerTop() + 2) {
			select = 1;
			return;
		}
		if(map.getRightPlayerTop() == 19) {
			select = 0;
			return;
		}
		
		System.out.println();
		System.out.println(map.getMap());
		System.out.println("上のレーンを動かします");
	    System.out.println("左に動かす場合は'0'を、右に動かす場合は'1'を入力してください");
		String input = scanner.next();
		
		try{
	    	order = Integer.parseInt(input);
	    }
	    catch(Exception execption){
	    	System.out.println("***数字を入力してください***");
	    	top();
	    }
		
		if(order == 0) {
			select= 0;
			return;
		}else if(order == 1) {
			select = 1;
			return;
		}else{
			System.out.println("***'0'か'1'を入力してください***");
			top();
		}
	}
	
	void bottom() {
		if(map.getRightPlayerBottom() ==  map.getLeftPlayerBottom() + 2) {
			select = 3;
			return;
		}
		if(map.getRightPlayerBottom() == 9) {
			select = 2;
			return;
		}
		
		System.out.println();
		System.out.println(map.getMap());
		System.out.println("下のレーンを動かします");
		System.out.println("左に動かす場合は'0'を、右に動かす場合は'1'を入力してください");
		String input = scanner.next();
		
		try{
	    	order = Integer.parseInt(input);
	    }
	    catch(Exception execption){
	    	System.out.println("***数字を入力してください***");
	    	bottom();
	    }
		
		if(order == 0) {
			select = 2;
			return;
		}else if(order == 1) {
			select = 3;
			return;
		}else{
			System.out.println("***'0'か'1'を入力してください***");
			bottom();
		}
	}
	
	void topRight() {
		System.out.println();
		System.out.println(map.getMap());
		System.out.println("上のレーンを動かします");
		System.out.println("右に何マス動かしますか？");
		String input = scanner.next();
		
		try{
	    	order = Integer.parseInt(input);
	    }
	    catch(Exception execption){
	    	System.out.println("***数字を入力してください***");
	    	topRight();
	    }
		
		if(order == 0) {
			System.out.println("***１マス以上動かしてください***");
			topRight();
		}
		
		map.setRightPlayerTop(order * 2);
		
		if(map.getRightPlayerTop() > 20) {
			System.out.println("***レーンの範囲外です***");
			map.setRightPlayerTop(-order * 2);
			topRight();
		}
		
		select = 4;
		return;
	}
	
	void topLeft() {
		System.out.println();
		System.out.println(map.getMap());
		System.out.println("上のレーンを動かします");
		System.out.println("左に何マス動かしますか？");
		String input = scanner.next();
		
		try{
	    	order = Integer.parseInt(input);
	    }
	    catch(Exception execption){
	    	System.out.println("***数字を入力してください***");
	    	topLeft();
	    }
		
		if(order == 0) {
			System.out.println("***１マス以上動かしてください***");
			topLeft();
		}
		
		map.setRightPlayerTop(-order * 2);
		
		if(map.getLeftPlayerTop() >= map.getRightPlayerTop()) {
			System.out.println("***左のプレイヤーを飛び越すことはできません***");
			map.setRightPlayerTop(order * 2);
			topLeft();
		}
		if(map.getRightPlayerTop() == 3 && map.getRightPlayerBottom() == 3){
			System.out.println(map.getMap());
			System.out.println("右のプレイヤーの勝利です");
			System.exit(0);
		}
		
		select = 4;
		return;
	}
	
	void bottomRight(){
		System.out.println();
		System.out.println(map.getMap());
		System.out.println("下のレーンを動かします");
		System.out.println("右に何マス動かしますか？");
		String input = scanner.next();
		
		try{
	    	order = Integer.parseInt(input);
	    }
	    catch(Exception execption){
	    	System.out.println("***数字を入力してください***");
	    	bottomRight();
	    }
		
		if(order == 0) {
			System.out.println("***１マス以上動かしてください***");
			bottomRight();
		}
		
		map.setRightPlayerBottom(order * 2)	;
		
		if(map.getRightPlayerBottom() > 9) {
			System.out.println("レーンの範囲外です");
			map.setRightPlayerBottom(-order * 2);
			bottomRight();
		}
		
		select = 4;
		return;
	}
	
	void bottomLeft(){
		System.out.println();
		System.out.println(map.getMap());
		System.out.println("下のレーンを動かします");
		System.out.println("左に何マス動かしますか？");
		String input = scanner.next();
		
		try{
	    	order = Integer.parseInt(input);
	    }
	    catch(Exception execption){
	    	System.out.println("***数字を入力してください***");
	    	bottomLeft();
	    }
		
		if(order == 0) {
			System.out.println("***１マス以上動かしてください***");
			bottomLeft();
		}
		
		map.setRightPlayerBottom(order * -2);
		
		if(map.getLeftPlayerBottom() >= map.getRightPlayerBottom()) {
			System.out.println("左のプレイヤーを飛び越すことはできません");
			map.setRightPlayerBottom(order * 2);
			bottomLeft();
		}
		if(map.getRightPlayerTop() == 3 && map.getRightPlayerBottom() == 3){
			System.out.println(map.getMap());
			System.out.println("右のプレイヤーの勝利です");
			System.exit(0);
		}
		
		select = 4;
		return;
	}
}