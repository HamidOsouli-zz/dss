/**
 * DSS - Digital Signature Services
 * Copyright (C) 2015 European Commission, provided under the CEF programme
 * 
 * This file is part of the "DSS - Digital Signature Services" project.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package eu.europa.esig.dss.validation.process.qualification.certificate;

import eu.europa.esig.dss.jaxb.detailedreport.XmlCertificate;
import eu.europa.esig.dss.jaxb.detailedreport.XmlConclusion;
import eu.europa.esig.dss.validation.policy.rules.Indication;
import eu.europa.esig.dss.validation.policy.rules.SubIndication;
import eu.europa.esig.dss.validation.process.ChainItem;
import eu.europa.esig.dss.validation.process.MessageTag;
import eu.europa.esig.jaxb.policy.LevelConstraint;

public class AcceptableBuildingBlockConclusionCheck extends ChainItem<XmlCertificate> {

	private final XmlConclusion buildingBlockConclusion;

	public AcceptableBuildingBlockConclusionCheck(XmlCertificate result, XmlConclusion buildingBlockConclusion, LevelConstraint constraint) {
		super(result, constraint);

		this.buildingBlockConclusion = buildingBlockConclusion;
	}

	@Override
	protected boolean process() {
		return isValidConclusion(buildingBlockConclusion);
	}

	@Override
	protected MessageTag getMessageTag() {
		return MessageTag.BBB_ACCEPT;
	}

	@Override
	protected MessageTag getErrorMessageTag() {
		return MessageTag.BBB_ACCEPT_ANS;
	}

	@Override
	protected Indication getFailedIndicationForConclusion() {
		return buildingBlockConclusion.getIndication();
	}

	@Override
	protected SubIndication getFailedSubIndicationForConclusion() {
		return buildingBlockConclusion.getSubIndication();
	}

}