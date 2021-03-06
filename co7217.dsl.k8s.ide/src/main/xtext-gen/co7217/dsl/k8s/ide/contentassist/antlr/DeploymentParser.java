/*
 * generated by Xtext 2.25.0
 */
package co7217.dsl.k8s.ide.contentassist.antlr;

import co7217.dsl.k8s.ide.contentassist.antlr.internal.InternalDeploymentParser;
import co7217.dsl.k8s.services.DeploymentGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class DeploymentParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DeploymentGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DeploymentGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getHeaderAccess().getAlternatives(), "rule__Header__Alternatives");
			builder.put(grammarAccess.getResourceAccess().getAlternatives(), "rule__Resource__Alternatives");
			builder.put(grammarAccess.getProtocolAccess().getAlternatives(), "rule__Protocol__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getLabelAccess().getGroup(), "rule__Label__Group__0");
			builder.put(grammarAccess.getContainerAccess().getGroup(), "rule__Container__Group__0");
			builder.put(grammarAccess.getMetriceAccess().getGroup(), "rule__Metrice__Group__0");
			builder.put(grammarAccess.getPortAccess().getGroup(), "rule__Port__Group__0");
			builder.put(grammarAccess.getDepAccess().getGroup(), "rule__Dep__Group__0");
			builder.put(grammarAccess.getDepAccess().getGroup_8(), "rule__Dep__Group_8__0");
			builder.put(grammarAccess.getDepAccess().getGroup_12(), "rule__Dep__Group_12__0");
			builder.put(grammarAccess.getDepAccess().getGroup_20(), "rule__Dep__Group_20__0");
			builder.put(grammarAccess.getHpaAccess().getGroup(), "rule__Hpa__Group__0");
			builder.put(grammarAccess.getHpaAccess().getGroup_8(), "rule__Hpa__Group_8__0");
			builder.put(grammarAccess.getHpaAccess().getGroup_12(), "rule__Hpa__Group_12__0");
			builder.put(grammarAccess.getHpaAccess().getGroup_30(), "rule__Hpa__Group_30__0");
			builder.put(grammarAccess.getSvcAccess().getGroup(), "rule__Svc__Group__0");
			builder.put(grammarAccess.getSvcAccess().getGroup_8(), "rule__Svc__Group_8__0");
			builder.put(grammarAccess.getSvcAccess().getGroup_12(), "rule__Svc__Group_12__0");
			builder.put(grammarAccess.getSvcAccess().getGroup_15(), "rule__Svc__Group_15__0");
			builder.put(grammarAccess.getSvcAccess().getGroup_27(), "rule__Svc__Group_27__0");
			builder.put(grammarAccess.getModelAccess().getHeadersAssignment(), "rule__Model__HeadersAssignment");
			builder.put(grammarAccess.getLabelAccess().getNameAssignment_0(), "rule__Label__NameAssignment_0");
			builder.put(grammarAccess.getLabelAccess().getValueAssignment_2(), "rule__Label__ValueAssignment_2");
			builder.put(grammarAccess.getContainerAccess().getNameAssignment_4(), "rule__Container__NameAssignment_4");
			builder.put(grammarAccess.getContainerAccess().getImageAssignment_8(), "rule__Container__ImageAssignment_8");
			builder.put(grammarAccess.getMetriceAccess().getResourceAssignment_0(), "rule__Metrice__ResourceAssignment_0");
			builder.put(grammarAccess.getMetriceAccess().getLimitAssignment_2(), "rule__Metrice__LimitAssignment_2");
			builder.put(grammarAccess.getPortAccess().getNameAssignment_4(), "rule__Port__NameAssignment_4");
			builder.put(grammarAccess.getPortAccess().getProtocolAssignment_8(), "rule__Port__ProtocolAssignment_8");
			builder.put(grammarAccess.getPortAccess().getInportAssignment_12(), "rule__Port__InportAssignment_12");
			builder.put(grammarAccess.getPortAccess().getTargetportAssignment_16(), "rule__Port__TargetportAssignment_16");
			builder.put(grammarAccess.getDepAccess().getNameAssignment_6(), "rule__Dep__NameAssignment_6");
			builder.put(grammarAccess.getDepAccess().getNamespaceAssignment_8_2(), "rule__Dep__NamespaceAssignment_8_2");
			builder.put(grammarAccess.getDepAccess().getLabelsAssignment_11(), "rule__Dep__LabelsAssignment_11");
			builder.put(grammarAccess.getDepAccess().getLabelsAssignment_12_1(), "rule__Dep__LabelsAssignment_12_1");
			builder.put(grammarAccess.getDepAccess().getReplicasAssignment_17(), "rule__Dep__ReplicasAssignment_17");
			builder.put(grammarAccess.getDepAccess().getContainersAssignment_19(), "rule__Dep__ContainersAssignment_19");
			builder.put(grammarAccess.getDepAccess().getContainersAssignment_20_1(), "rule__Dep__ContainersAssignment_20_1");
			builder.put(grammarAccess.getHpaAccess().getNameAssignment_6(), "rule__Hpa__NameAssignment_6");
			builder.put(grammarAccess.getHpaAccess().getNamespaceAssignment_8_2(), "rule__Hpa__NamespaceAssignment_8_2");
			builder.put(grammarAccess.getHpaAccess().getLabelsAssignment_11(), "rule__Hpa__LabelsAssignment_11");
			builder.put(grammarAccess.getHpaAccess().getLabelsAssignment_12_1(), "rule__Hpa__LabelsAssignment_12_1");
			builder.put(grammarAccess.getHpaAccess().getTargetAssignment_17(), "rule__Hpa__TargetAssignment_17");
			builder.put(grammarAccess.getHpaAccess().getMinimumAssignment_21(), "rule__Hpa__MinimumAssignment_21");
			builder.put(grammarAccess.getHpaAccess().getMaximumAssignment_25(), "rule__Hpa__MaximumAssignment_25");
			builder.put(grammarAccess.getHpaAccess().getMetricesAssignment_29(), "rule__Hpa__MetricesAssignment_29");
			builder.put(grammarAccess.getHpaAccess().getMetricesAssignment_30_1(), "rule__Hpa__MetricesAssignment_30_1");
			builder.put(grammarAccess.getSvcAccess().getNameAssignment_6(), "rule__Svc__NameAssignment_6");
			builder.put(grammarAccess.getSvcAccess().getNamespaceAssignment_8_2(), "rule__Svc__NamespaceAssignment_8_2");
			builder.put(grammarAccess.getSvcAccess().getLabelsAssignment_11(), "rule__Svc__LabelsAssignment_11");
			builder.put(grammarAccess.getSvcAccess().getLabelsAssignment_12_1(), "rule__Svc__LabelsAssignment_12_1");
			builder.put(grammarAccess.getSvcAccess().getPortsAssignment_15_0(), "rule__Svc__PortsAssignment_15_0");
			builder.put(grammarAccess.getSvcAccess().getTargetLabelAssignment_18(), "rule__Svc__TargetLabelAssignment_18");
			builder.put(grammarAccess.getSvcAccess().getTargetNameAssignment_22(), "rule__Svc__TargetNameAssignment_22");
			builder.put(grammarAccess.getSvcAccess().getTypeAssignment_26(), "rule__Svc__TypeAssignment_26");
			builder.put(grammarAccess.getSvcAccess().getIPAssignment_27_3(), "rule__Svc__IPAssignment_27_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DeploymentGrammarAccess grammarAccess;

	@Override
	protected InternalDeploymentParser createParser() {
		InternalDeploymentParser result = new InternalDeploymentParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DeploymentGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DeploymentGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
