



	class Account{
		private int number;
		protected int balance;

                public Account(int n, int b){number=n;
                                     balance=b;}
                public boolean withdraw(int amt){
			if (amt>balance) return false;
		    else {   balance -=amt;
		             return true;}
		 }

		public int read_balance()
		{
			return balance;
		}

	}

