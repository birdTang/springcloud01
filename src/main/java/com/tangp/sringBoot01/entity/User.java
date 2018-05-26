package com.tangp.sringBoot01.entity;


public class User {
	private Integer id;
	private int age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	private static class ThreadTest implements Runnable {
		
		private volatile User user;
		
		
		public ThreadTest(User user) {
			super();
			this.user = user;
			
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("当前用户age为："+user.getAge());
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		User user = new User();
		user.setId(1);
		for(int i=0;i<3;i++) {
			user.setAge(i);
			System.out.println(Thread.currentThread().getId());
			new Thread(new ThreadTest(user)).start();
		}
		System.out.println("我是master111");
		System.out.println("我是github ---master");
		System.out.println("我是master222");
		System.out.println("我是github ---master222");
		System.out.println("我是master333");
		System.out.println("我是github ---master333");
	}
}
