package main;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Fila  {
	Queue<Passageiro> fila = new Queue<Passageiro>() {
		
		@Override
		public <T> T[] toArray(T[] a) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public int size() {
			return fila.size();
		}
		
		@Override
		public boolean retainAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean removeAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean remove(Object o) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public Iterator<Passageiro> iterator() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean containsAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean contains(Object o) {
			return fila.contains(o);
		}
		
		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public boolean addAll(Collection<? extends Passageiro> c) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public Passageiro remove() {
			fila.remove();
			return null;
		}
		
		@Override
		public Passageiro poll() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Passageiro peek() {
			return fila.peek();
		}
		
		@Override
		public boolean offer(Passageiro e) {
			fila.offer(e);
			return false;
		}
		
		@Override
		public Passageiro element() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean add(Passageiro e) {
			// TODO Auto-generated method stub
			return false;
		}
	};






	

	
}
