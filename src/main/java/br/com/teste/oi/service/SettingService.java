package br.com.teste.oi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.teste.oi.domain.Language;
import br.com.teste.oi.domain.Setting;
import br.com.teste.oi.domain.Star;

@Service("settingService")
@Component
public class SettingService {
	
	private AtomicLong atomicLong = new AtomicLong();
	
	private List<Setting> settings = new ArrayList<>();
	
	{
		settings = createSettings();
	}

	
	private List<Setting> createSettings(){
		Setting setting = new Setting(atomicLong.getAndIncrement(), Language.JAVA, new Star(1l,100,400), 140);
		Setting setting2 = new Setting(atomicLong.getAndIncrement(), Language.ANDROID, new Star(1l,100,400), 140);
		Setting setting3 = new Setting(atomicLong.getAndIncrement(), Language.SWIFT, new Star(1l,100,400), 140);
		
		settings.add(setting);
		settings.add(setting2);
		settings.add(setting3);
		
		return settings;
	}
	
	public List<Setting> getSettings() {
		return settings;
	}
	
	public Optional<Setting> findById(Long id) {
		return settings.stream().filter(s -> s.getId().equals(id)).findFirst();
	}
	
	public void create(Setting setting) {
		settings.add(setting);
	}
}
