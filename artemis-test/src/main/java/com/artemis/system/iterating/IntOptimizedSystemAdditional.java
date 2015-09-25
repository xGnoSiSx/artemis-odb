package com.artemis.system.iterating;

import com.artemis.Aspect;
import com.artemis.Entity;
import com.artemis.systems.EntityProcessingSystem;

public class IntOptimizedSystemAdditional extends EntityProcessingSystem {

	public IntOptimizedSystemAdditional() {
		super(Aspect.all());

		setEnabled(true);
		begin();
	}

	@Override
	public void setEnabled(boolean enabled) {
		super.setEnabled(enabled);
	}

	@Override
	protected void begin() {
		super.begin();
	}

	@Override
	protected void process(Entity e) {}
}
