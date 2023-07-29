
package com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilitybuilder.behavior.action.unitlisteners;

import java.util.Map;

import com.etheller.warsmash.viewer5.handlers.w3x.simulation.CSimulation;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.CUnit;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilitybuilder.behavior.callback.enumcallbacks.ABAttackPreDamageListenerPriorityCallback;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilitybuilder.behavior.callback.listenercallbacks.ABAttackPreDamageListenerCallback;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilitybuilder.behavior.callback.unitcallbacks.ABUnitCallback;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilitybuilder.core.ABAction;

public class ABActionRemoveAttackPreDamageListener implements ABAction {

	private ABUnitCallback targetUnit;
	private ABAttackPreDamageListenerPriorityCallback priority;
	private ABAttackPreDamageListenerCallback buff;

	public void runAction(final CSimulation game, final CUnit caster, final Map<String, Object> localStore) {
		CUnit target = targetUnit.callback(game, caster, localStore);
		
		target.removePreDamageListener(priority.callback(game, caster, localStore), buff.callback(game, caster, localStore));
	}
}