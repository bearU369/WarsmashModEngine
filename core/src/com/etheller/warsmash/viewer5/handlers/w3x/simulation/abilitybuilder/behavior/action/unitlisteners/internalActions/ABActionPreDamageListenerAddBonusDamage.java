
package com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilitybuilder.behavior.action.unitlisteners.internalActions;

import java.util.Map;

import com.etheller.warsmash.viewer5.handlers.w3x.simulation.CSimulation;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.CUnit;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilitybuilder.behavior.callback.floatcallbacks.ABFloatCallback;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilitybuilder.core.ABAction;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilitybuilder.core.ABLocalStoreKeys;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.combat.attacks.listeners.CUnitAttackPreDamageListenerDamageModResult;

public class ABActionPreDamageListenerAddBonusDamage implements ABAction {

	private ABFloatCallback value;

	public void runAction(final CSimulation game, final CUnit caster, final Map<String, Object> localStore) {
		CUnitAttackPreDamageListenerDamageModResult result = (CUnitAttackPreDamageListenerDamageModResult) localStore
				.get(ABLocalStoreKeys.PREDAMAGERESULT);
		result.addBonusDamage(value.callback(game, caster, localStore));
	}
}