package com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilities.types.impl;

import java.util.List;

import com.etheller.warsmash.util.War3ID;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilities.CAbility;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilities.item.CAbilityItemStatBonus;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilities.types.CAbilityType;

public class CAbilityTypeItemStatBonus extends CAbilityType<CAbilityTypeItemStatBonusLevelData> {

	public CAbilityTypeItemStatBonus(final War3ID alias, final War3ID code,
			final List<CAbilityTypeItemStatBonusLevelData> levelData) {
		super(alias, code, levelData);
	}

	@Override
	public CAbility createAbility(final int handleId) {
		final CAbilityTypeItemStatBonusLevelData levelData = getLevelData(0);
		return new CAbilityItemStatBonus(handleId, getAlias(), levelData.getStrength(), levelData.getAgility(),
				levelData.getIntelligence());
	}

}