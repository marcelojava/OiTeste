package br.com.teste.oi.service;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.teste.oi.domain.Owner;

@Service("ownerService")
@Component
public class OwnerService {
	
	private AtomicLong ownerId = new AtomicLong(1);
	
	private List<Owner> owners;
	
	{
		owners = createOwner();
	}
	
	private List<Owner> createOwner() {

		Owner owner = new Owner(ownerId.getAndIncrement(), "Jose Antonio", "jantonio", "teste", "teste", "teste");
		Owner owner2 = new Owner(ownerId.getAndIncrement(), "Jose Antonio", "jantonio", "teste", "teste", "teste");
		

		return Arrays.asList(owner, owner2);
	}

	public List<Owner> getOwners() {
		return owners;
	}
	
}
