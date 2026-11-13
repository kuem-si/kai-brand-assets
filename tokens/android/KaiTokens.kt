// GENERATED from design-tokens/src by tools/foundations (npm run adapters). Do not edit. Values: ADR 0005; chart colours and adapters: ADR 0006; chart scales: ADR 0008 (approved); motion roles: ADR 0009 (approved); breakpoints and elevation: ADR 0014 (approved).
package si.kuem.kai.tokens

import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/** Colour roles per mode. Status, ai.* and data.* roles are protected: tenants never override them (ADR 0002). */
class KaiColorScheme(
    val brandInk: Color,
    val brandOnInk: Color,
    val brandAction: Color,
    val brandActionDark: Color,
    val brandMarkDark: Color,
    val brandMark: Color,
    val bgCanvas: Color,
    val bgSurface: Color,
    val bgSunken: Color,
    val borderSubtle: Color,
    val borderStrong: Color,
    val textDefault: Color,
    val textMuted: Color,
    val textDisabled: Color,
    val textLink: Color,
    val textOnAction: Color,
    val actionPrimary: Color,
    val actionPrimaryHover: Color,
    val actionPrimaryPressed: Color,
    val selectionBg: Color,
    val selectionRule: Color,
    val focusRing: Color,
    val statusCriticalFg: Color,
    val statusCriticalBg: Color,
    val statusCriticalBorder: Color,
    val statusWarningFg: Color,
    val statusWarningBg: Color,
    val statusWarningBorder: Color,
    val statusSuccessFg: Color,
    val statusSuccessBg: Color,
    val statusSuccessBorder: Color,
    val statusInfoFg: Color,
    val statusInfoBg: Color,
    val statusInfoBorder: Color,
    val statusNeutralFg: Color,
    val statusNeutralBg: Color,
    val statusNeutralBorder: Color,
    val aiRequestMarker: Color,
    val aiRequestBorder: Color,
    val aiRequestBg: Color,
    val aiContextMarker: Color,
    val aiContextBorder: Color,
    val aiContextBg: Color,
    val aiObservedMarker: Color,
    val aiObservedBorder: Color,
    val aiObservedBg: Color,
    val aiInferenceMarker: Color,
    val aiInferenceBorder: Color,
    val aiInferenceBg: Color,
    val aiEvidenceMarker: Color,
    val aiEvidenceBorder: Color,
    val aiEvidenceBg: Color,
    val aiRecommendationMarker: Color,
    val aiRecommendationBorder: Color,
    val aiRecommendationBg: Color,
    val aiConfirmedMarker: Color,
    val aiConfirmedBorder: Color,
    val aiConfirmedBg: Color,
    val aiTrackLine: Color,
    val aiTrackPending: Color,
    val aiTrackActive: Color,
    val aiTrackDone: Color,
    val dataSeries1: Color,
    val dataSeries2: Color,
    val dataSeries3: Color,
    val dataSeries4: Color,
    val dataSeries5: Color,
    val dataSeries6: Color,
    val dataGrid: Color,
    val dataAxis: Color,
    val dataGap: Color,
    val dataSeq1: Color,
    val dataSeq2: Color,
    val dataSeq3: Color,
    val dataSeq4: Color,
    val dataSeq5: Color,
    val dataSeq6: Color,
    val dataSeq7: Color,
    val dataDiv1: Color,
    val dataDiv2: Color,
    val dataDiv3: Color,
    val dataDiv4: Color,
    val dataDiv5: Color,
    val dataDiv6: Color,
    val dataDiv7: Color,
)

object KaiColors {
    val light = KaiColorScheme(
        brandInk = Color(0xFF01324B),
        brandOnInk = Color(0xFFF0F8FE),
        brandAction = Color(0xFF004869),
        brandActionDark = Color(0xFF7CBDE7),
        brandMarkDark = Color(0xFFC3E3F9),
        brandMark = Color(0xFF01324B),
        bgCanvas = Color(0xFFF4F7FA),
        bgSurface = Color(0xFFFFFFFF),
        bgSunken = Color(0xFFECF1F5),
        borderSubtle = Color(0xFFD3D8DC),
        borderStrong = Color(0xFF7A8187),
        textDefault = Color(0xFF151A1E),
        textMuted = Color(0xFF5D646A),
        textDisabled = Color(0xFF999FA4),
        textLink = Color(0xFF005982),
        textOnAction = Color(0xFFFFFFFF),
        actionPrimary = Color(0xFF004869),
        actionPrimaryHover = Color(0xFF01324B),
        actionPrimaryPressed = Color(0xFF001D2F),
        selectionBg = Color(0xFFE0F1FE),
        selectionRule = Color(0xFF004869),
        focusRing = Color(0xFF0171A3),
        statusCriticalFg = Color(0xFFB02A2D),
        statusCriticalBg = Color(0xFFFEF2F1),
        statusCriticalBorder = Color(0xFFF2A7A1),
        statusWarningFg = Color(0xFF8D5E00),
        statusWarningBg = Color(0xFFFFF5E8),
        statusWarningBorder = Color(0xFFFBC77C),
        statusSuccessFg = Color(0xFF267543),
        statusSuccessBg = Color(0xFFEEF8F0),
        statusSuccessBorder = Color(0xFF92D7A4),
        statusInfoFg = Color(0xFF42494E),
        statusInfoBg = Color(0xFFECF1F5),
        statusInfoBorder = Color(0xFFB8BFC4),
        statusNeutralFg = Color(0xFF5D646A),
        statusNeutralBg = Color(0xFFECF1F5),
        statusNeutralBorder = Color(0xFFB8BFC4),
        aiRequestMarker = Color(0xFF5D646A),
        aiRequestBorder = Color(0xFF7A8187),
        aiRequestBg = Color(0xFFECF1F5),
        aiContextMarker = Color(0xFF5D646A),
        aiContextBorder = Color(0xFFD3D8DC),
        aiContextBg = Color(0xFFFFFFFF),
        aiObservedMarker = Color(0xFF151A1E),
        aiObservedBorder = Color(0xFF151A1E),
        aiObservedBg = Color(0xFFFFFFFF),
        aiInferenceMarker = Color(0xFF151A1E),
        aiInferenceBorder = Color(0xFF7A8187),
        aiInferenceBg = Color(0xFFFFFFFF),
        aiEvidenceMarker = Color(0xFF42494E),
        aiEvidenceBorder = Color(0xFFD3D8DC),
        aiEvidenceBg = Color(0xFFFFFFFF),
        aiRecommendationMarker = Color(0xFF151A1E),
        aiRecommendationBorder = Color(0xFF004869),
        aiRecommendationBg = Color(0xFFFFFFFF),
        aiConfirmedMarker = Color(0xFF151A1E),
        aiConfirmedBorder = Color(0xFF151A1E),
        aiConfirmedBg = Color(0xFFECF1F5),
        aiTrackLine = Color(0xFFD3D8DC),
        aiTrackPending = Color(0xFF7A8187),
        aiTrackActive = Color(0xFF151A1E),
        aiTrackDone = Color(0xFF151A1E),
        dataSeries1 = Color(0xFF005C86),
        dataSeries2 = Color(0xFF0B7C75),
        dataSeries3 = Color(0xFF7C4A98),
        dataSeries4 = Color(0xFF677329),
        dataSeries5 = Color(0xFFAD4C6C),
        dataSeries6 = Color(0xFF1488A2),
        dataGrid = Color(0xFFE3E9ED),
        dataAxis = Color(0xFF7A8187),
        dataGap = Color(0xFF999FA4),
        dataSeq1 = Color(0xFFDCEEFA),
        dataSeq2 = Color(0xFFB3D6EE),
        dataSeq3 = Color(0xFF83BCE2),
        dataSeq4 = Color(0xFF509ECE),
        dataSeq5 = Color(0xFF1680B5),
        dataSeq6 = Color(0xFF03628D),
        dataSeq7 = Color(0xFF024565),
        dataDiv1 = Color(0xFF014D71),
        dataDiv2 = Color(0xFF247DAD),
        dataDiv3 = Color(0xFF87B8D9),
        dataDiv4 = Color(0xFFE4E8EB),
        dataDiv5 = Color(0xFFC2A3D6),
        dataDiv6 = Color(0xFF8E5BAB),
        dataDiv7 = Color(0xFF5D3075),
    )
    val dark = KaiColorScheme(
        brandInk = Color(0xFF01324B),
        brandOnInk = Color(0xFFF0F8FE),
        brandAction = Color(0xFF004869),
        brandActionDark = Color(0xFF7CBDE7),
        brandMarkDark = Color(0xFFC3E3F9),
        brandMark = Color(0xFFC3E3F9),
        bgCanvas = Color(0xFF0C1013),
        bgSurface = Color(0xFF151A1E),
        bgSunken = Color(0xFF070B0E),
        borderSubtle = Color(0xFF292F33),
        borderStrong = Color(0xFF7A8187),
        textDefault = Color(0xFFF4F7FA),
        textMuted = Color(0xFFB8BFC4),
        textDisabled = Color(0xFF5D646A),
        textLink = Color(0xFF96CCEF),
        textOnAction = Color(0xFF0C1013),
        actionPrimary = Color(0xFF7CBDE7),
        actionPrimaryHover = Color(0xFF96CCEF),
        actionPrimaryPressed = Color(0xFFC3E3F9),
        selectionBg = Color(0xFF001D2F),
        selectionRule = Color(0xFF7CBDE7),
        focusRing = Color(0xFF64AEDC),
        statusCriticalFg = Color(0xFFF7857D),
        statusCriticalBg = Color(0xFF521615),
        statusCriticalBorder = Color(0xFF942124),
        statusWarningFg = Color(0xFFEBB25F),
        statusWarningBg = Color(0xFF472D00),
        statusWarningBorder = Color(0xFF734C02),
        statusSuccessFg = Color(0xFF72C78B),
        statusSuccessBg = Color(0xFF0A371B),
        statusSuccessBorder = Color(0xFF175F33),
        statusInfoFg = Color(0xFFD3D8DC),
        statusInfoBg = Color(0xFF292F33),
        statusInfoBorder = Color(0xFF5D646A),
        statusNeutralFg = Color(0xFFB8BFC4),
        statusNeutralBg = Color(0xFF292F33),
        statusNeutralBorder = Color(0xFF5D646A),
        aiRequestMarker = Color(0xFFB8BFC4),
        aiRequestBorder = Color(0xFF7A8187),
        aiRequestBg = Color(0xFF070B0E),
        aiContextMarker = Color(0xFFB8BFC4),
        aiContextBorder = Color(0xFF292F33),
        aiContextBg = Color(0xFF151A1E),
        aiObservedMarker = Color(0xFFF4F7FA),
        aiObservedBorder = Color(0xFFF4F7FA),
        aiObservedBg = Color(0xFF151A1E),
        aiInferenceMarker = Color(0xFFF4F7FA),
        aiInferenceBorder = Color(0xFF7A8187),
        aiInferenceBg = Color(0xFF151A1E),
        aiEvidenceMarker = Color(0xFFD3D8DC),
        aiEvidenceBorder = Color(0xFF292F33),
        aiEvidenceBg = Color(0xFF151A1E),
        aiRecommendationMarker = Color(0xFFF4F7FA),
        aiRecommendationBorder = Color(0xFF7CBDE7),
        aiRecommendationBg = Color(0xFF151A1E),
        aiConfirmedMarker = Color(0xFFF4F7FA),
        aiConfirmedBorder = Color(0xFFF4F7FA),
        aiConfirmedBg = Color(0xFF070B0E),
        aiTrackLine = Color(0xFF292F33),
        aiTrackPending = Color(0xFF7A8187),
        aiTrackActive = Color(0xFFF4F7FA),
        aiTrackDone = Color(0xFFF4F7FA),
        dataSeries1 = Color(0xFF62B5E8),
        dataSeries2 = Color(0xFF5AC6BD),
        dataSeries3 = Color(0xFFC494E2),
        dataSeries4 = Color(0xFFB1C16D),
        dataSeries5 = Color(0xFFEB93AC),
        dataSeries6 = Color(0xFF8DD8ED),
        dataGrid = Color(0xFF292F33),
        dataAxis = Color(0xFF7A8187),
        dataGap = Color(0xFF5D646A),
        dataSeq1 = Color(0xFF1A394C),
        dataSeq2 = Color(0xFF23526F),
        dataSeq3 = Color(0xFF2B6D93),
        dataSeq4 = Color(0xFF3989B7),
        dataSeq5 = Color(0xFF56A4D5),
        dataSeq6 = Color(0xFF7FC0EA),
        dataSeq7 = Color(0xFFB3DEFB),
        dataDiv1 = Color(0xFFA6D8FA),
        dataDiv2 = Color(0xFF55A8DB),
        dataDiv3 = Color(0xFF23709B),
        dataDiv4 = Color(0xFF303336),
        dataDiv5 = Color(0xFF7E5596),
        dataDiv6 = Color(0xFFB788D4),
        dataDiv7 = Color(0xFFE1C4F3),
    )
    val lightHc = KaiColorScheme(
        brandInk = Color(0xFF01324B),
        brandOnInk = Color(0xFFF0F8FE),
        brandAction = Color(0xFF004869),
        brandActionDark = Color(0xFF7CBDE7),
        brandMarkDark = Color(0xFFC3E3F9),
        brandMark = Color(0xFF01324B),
        bgCanvas = Color(0xFFFFFFFF),
        bgSurface = Color(0xFFFFFFFF),
        bgSunken = Color(0xFFF4F7FA),
        borderSubtle = Color(0xFF5D646A),
        borderStrong = Color(0xFF151A1E),
        textDefault = Color(0xFF000000),
        textMuted = Color(0xFF292F33),
        textDisabled = Color(0xFF5D646A),
        textLink = Color(0xFF01324B),
        textOnAction = Color(0xFFFFFFFF),
        actionPrimary = Color(0xFF01324B),
        actionPrimaryHover = Color(0xFF001D2F),
        actionPrimaryPressed = Color(0xFF000000),
        selectionBg = Color(0xFFE0F1FE),
        selectionRule = Color(0xFF001D2F),
        focusRing = Color(0xFF001D2F),
        statusCriticalFg = Color(0xFF521615),
        statusCriticalBg = Color(0xFFFEF2F1),
        statusCriticalBorder = Color(0xFF942124),
        statusWarningFg = Color(0xFF472D00),
        statusWarningBg = Color(0xFFFFF5E8),
        statusWarningBorder = Color(0xFF734C02),
        statusSuccessFg = Color(0xFF0A371B),
        statusSuccessBg = Color(0xFFEEF8F0),
        statusSuccessBorder = Color(0xFF175F33),
        statusInfoFg = Color(0xFF151A1E),
        statusInfoBg = Color(0xFFF4F7FA),
        statusInfoBorder = Color(0xFF151A1E),
        statusNeutralFg = Color(0xFF292F33),
        statusNeutralBg = Color(0xFFF4F7FA),
        statusNeutralBorder = Color(0xFF292F33),
        aiRequestMarker = Color(0xFF292F33),
        aiRequestBorder = Color(0xFF151A1E),
        aiRequestBg = Color(0xFFF4F7FA),
        aiContextMarker = Color(0xFF292F33),
        aiContextBorder = Color(0xFF5D646A),
        aiContextBg = Color(0xFFFFFFFF),
        aiObservedMarker = Color(0xFF000000),
        aiObservedBorder = Color(0xFF000000),
        aiObservedBg = Color(0xFFFFFFFF),
        aiInferenceMarker = Color(0xFF000000),
        aiInferenceBorder = Color(0xFF151A1E),
        aiInferenceBg = Color(0xFFFFFFFF),
        aiEvidenceMarker = Color(0xFF151A1E),
        aiEvidenceBorder = Color(0xFF5D646A),
        aiEvidenceBg = Color(0xFFFFFFFF),
        aiRecommendationMarker = Color(0xFF000000),
        aiRecommendationBorder = Color(0xFF01324B),
        aiRecommendationBg = Color(0xFFFFFFFF),
        aiConfirmedMarker = Color(0xFF000000),
        aiConfirmedBorder = Color(0xFF000000),
        aiConfirmedBg = Color(0xFFF4F7FA),
        aiTrackLine = Color(0xFF5D646A),
        aiTrackPending = Color(0xFF42494E),
        aiTrackActive = Color(0xFF000000),
        aiTrackDone = Color(0xFF000000),
        dataSeries1 = Color(0xFF003F5E),
        dataSeries2 = Color(0xFF035D57),
        dataSeries3 = Color(0xFF5F2D79),
        dataSeries4 = Color(0xFF4B5600),
        dataSeries5 = Color(0xFF8C2E50),
        dataSeries6 = Color(0xFF01697E),
        dataGrid = Color(0xFFB8BFC4),
        dataAxis = Color(0xFF292F33),
        dataGap = Color(0xFF42494E),
        dataSeq1 = Color(0xFFDCEEFA),
        dataSeq2 = Color(0xFFB3D6EE),
        dataSeq3 = Color(0xFF83BCE2),
        dataSeq4 = Color(0xFF509ECE),
        dataSeq5 = Color(0xFF1680B5),
        dataSeq6 = Color(0xFF03628D),
        dataSeq7 = Color(0xFF024565),
        dataDiv1 = Color(0xFF014D71),
        dataDiv2 = Color(0xFF247DAD),
        dataDiv3 = Color(0xFF87B8D9),
        dataDiv4 = Color(0xFFE4E8EB),
        dataDiv5 = Color(0xFFC2A3D6),
        dataDiv6 = Color(0xFF8E5BAB),
        dataDiv7 = Color(0xFF5D3075),
    )
    val darkHc = KaiColorScheme(
        brandInk = Color(0xFF01324B),
        brandOnInk = Color(0xFFF0F8FE),
        brandAction = Color(0xFF004869),
        brandActionDark = Color(0xFF7CBDE7),
        brandMarkDark = Color(0xFFC3E3F9),
        brandMark = Color(0xFFC3E3F9),
        bgCanvas = Color(0xFF000000),
        bgSurface = Color(0xFF000000),
        bgSunken = Color(0xFF070B0E),
        borderSubtle = Color(0xFF999FA4),
        borderStrong = Color(0xFFECF1F5),
        textDefault = Color(0xFFFFFFFF),
        textMuted = Color(0xFFE3E9ED),
        textDisabled = Color(0xFF999FA4),
        textLink = Color(0xFFC3E3F9),
        textOnAction = Color(0xFF000000),
        actionPrimary = Color(0xFFC3E3F9),
        actionPrimaryHover = Color(0xFFE0F1FE),
        actionPrimaryPressed = Color(0xFFF0F8FE),
        selectionBg = Color(0xFF001D2F),
        selectionRule = Color(0xFFC3E3F9),
        focusRing = Color(0xFFE0F1FE),
        statusCriticalFg = Color(0xFFF2A7A1),
        statusCriticalBg = Color(0xFF521615),
        statusCriticalBorder = Color(0xFFF2A7A1),
        statusWarningFg = Color(0xFFFBC77C),
        statusWarningBg = Color(0xFF472D00),
        statusWarningBorder = Color(0xFFFBC77C),
        statusSuccessFg = Color(0xFF92D7A4),
        statusSuccessBg = Color(0xFF0A371B),
        statusSuccessBorder = Color(0xFF92D7A4),
        statusInfoFg = Color(0xFFECF1F5),
        statusInfoBg = Color(0xFF151A1E),
        statusInfoBorder = Color(0xFFECF1F5),
        statusNeutralFg = Color(0xFFE3E9ED),
        statusNeutralBg = Color(0xFF151A1E),
        statusNeutralBorder = Color(0xFFE3E9ED),
        aiRequestMarker = Color(0xFFE3E9ED),
        aiRequestBorder = Color(0xFFECF1F5),
        aiRequestBg = Color(0xFF070B0E),
        aiContextMarker = Color(0xFFE3E9ED),
        aiContextBorder = Color(0xFF999FA4),
        aiContextBg = Color(0xFF000000),
        aiObservedMarker = Color(0xFFFFFFFF),
        aiObservedBorder = Color(0xFFFFFFFF),
        aiObservedBg = Color(0xFF000000),
        aiInferenceMarker = Color(0xFFFFFFFF),
        aiInferenceBorder = Color(0xFFECF1F5),
        aiInferenceBg = Color(0xFF000000),
        aiEvidenceMarker = Color(0xFFECF1F5),
        aiEvidenceBorder = Color(0xFF999FA4),
        aiEvidenceBg = Color(0xFF000000),
        aiRecommendationMarker = Color(0xFFFFFFFF),
        aiRecommendationBorder = Color(0xFFC3E3F9),
        aiRecommendationBg = Color(0xFF000000),
        aiConfirmedMarker = Color(0xFFFFFFFF),
        aiConfirmedBorder = Color(0xFFFFFFFF),
        aiConfirmedBg = Color(0xFF070B0E),
        aiTrackLine = Color(0xFF7A8187),
        aiTrackPending = Color(0xFFB8BFC4),
        aiTrackActive = Color(0xFFFFFFFF),
        aiTrackDone = Color(0xFFFFFFFF),
        dataSeries1 = Color(0xFF62B5E8),
        dataSeries2 = Color(0xFF5AC6BD),
        dataSeries3 = Color(0xFFC494E2),
        dataSeries4 = Color(0xFFB1C16D),
        dataSeries5 = Color(0xFFEB93AC),
        dataSeries6 = Color(0xFF8DD8ED),
        dataGrid = Color(0xFF42494E),
        dataAxis = Color(0xFFD3D8DC),
        dataGap = Color(0xFFB8BFC4),
        dataSeq1 = Color(0xFF1A394C),
        dataSeq2 = Color(0xFF23526F),
        dataSeq3 = Color(0xFF2B6D93),
        dataSeq4 = Color(0xFF3989B7),
        dataSeq5 = Color(0xFF56A4D5),
        dataSeq6 = Color(0xFF7FC0EA),
        dataSeq7 = Color(0xFFB3DEFB),
        dataDiv1 = Color(0xFFA6D8FA),
        dataDiv2 = Color(0xFF55A8DB),
        dataDiv3 = Color(0xFF23709B),
        dataDiv4 = Color(0xFF303336),
        dataDiv5 = Color(0xFF7E5596),
        dataDiv6 = Color(0xFFB788D4),
        dataDiv7 = Color(0xFFE1C4F3),
    )
}

object KaiDimens {
    val space0 = 0.dp
    val space25 = 1.dp
    val space50 = 2.dp
    val space100 = 4.dp
    val space150 = 6.dp
    val space200 = 8.dp
    val space300 = 12.dp
    val space400 = 16.dp
    val space500 = 20.dp
    val space600 = 24.dp
    val space800 = 32.dp
    val space1000 = 40.dp
    val space1200 = 48.dp
    val space1600 = 64.dp
    val radiusNone = 0.dp
    val radiusXs = 2.dp
    val radiusControl = 6.dp
    val radiusCard = 8.dp
    val radiusDialog = 12.dp
    val radiusFull = 9999.dp
    val borderWidthHairline = 1.dp
    val borderWidthRule = 2.dp
    val borderWidthFocus = 2.dp
    val borderWidthFocusHc = 3.dp
    val sizeIconSm = 16.dp
    val sizeIconMd = 20.dp
    val sizeIconLg = 24.dp
    val sizeControlSm = 28.dp
    val sizeControlMd = 32.dp
    val sizeControlLg = 40.dp
    val sizeTouchMin = 48.dp
    val sizeTrackMarker = 14.dp
    val breakpointCompact = 600.dp
    val breakpointMedium = 900.dp
    val breakpointExpanded = 1200.dp
}

/** Type roles in sp so they follow the system font scale. Pass the bundled IBM Plex families. */
class KaiTypography(sans: FontFamily, mono: FontFamily) {
    val caption = TextStyle(fontFamily = sans, fontWeight = FontWeight(400), fontSize = 12.sp, lineHeight = 16.sp, letterSpacing = 0.sp)
    val label = TextStyle(fontFamily = sans, fontWeight = FontWeight(600), fontSize = 12.sp, lineHeight = 16.sp, letterSpacing = 0.2.sp)
    val bodySm = TextStyle(fontFamily = sans, fontWeight = FontWeight(400), fontSize = 13.sp, lineHeight = 18.sp, letterSpacing = 0.sp)
    val body = TextStyle(fontFamily = sans, fontWeight = FontWeight(400), fontSize = 14.sp, lineHeight = 20.sp, letterSpacing = 0.sp)
    val bodyStrong = TextStyle(fontFamily = sans, fontWeight = FontWeight(600), fontSize = 14.sp, lineHeight = 20.sp, letterSpacing = 0.sp)
    val reading = TextStyle(fontFamily = sans, fontWeight = FontWeight(400), fontSize = 16.sp, lineHeight = 24.sp, letterSpacing = 0.sp)
    val readingStrong = TextStyle(fontFamily = sans, fontWeight = FontWeight(600), fontSize = 16.sp, lineHeight = 24.sp, letterSpacing = 0.sp)
    val titleSm = TextStyle(fontFamily = sans, fontWeight = FontWeight(600), fontSize = 16.sp, lineHeight = 22.sp, letterSpacing = 0.sp)
    val title = TextStyle(fontFamily = sans, fontWeight = FontWeight(600), fontSize = 18.sp, lineHeight = 24.sp, letterSpacing = 0.sp)
    val heading = TextStyle(fontFamily = sans, fontWeight = FontWeight(600), fontSize = 22.sp, lineHeight = 28.sp, letterSpacing = -0.1.sp)
    val display = TextStyle(fontFamily = sans, fontWeight = FontWeight(600), fontSize = 28.sp, lineHeight = 34.sp, letterSpacing = -0.2.sp)
    val displayLg = TextStyle(fontFamily = sans, fontWeight = FontWeight(600), fontSize = 40.sp, lineHeight = 48.sp, letterSpacing = -0.4.sp)
    val data = TextStyle(fontFamily = mono, fontWeight = FontWeight(400), fontSize = 13.sp, lineHeight = 18.sp, letterSpacing = 0.sp)
    val dataSm = TextStyle(fontFamily = mono, fontWeight = FontWeight(400), fontSize = 12.sp, lineHeight = 16.sp, letterSpacing = 0.sp)
}

/** Shadow elevation (ADR 0014): raised = menus, popovers, sheets; overlay = toasts, dialogs. In high contrast keep the border. */
object KaiElevation {
    val raised = 3.dp
    val overlay = 8.dp
}

object KaiMotion {
    const val FAST_MS = 120
    const val BASE_MS = 200
    const val SLOW_MS = 320
    const val STEP_MIN_MS = 400
    /** Brand moment only (Checkpoint fill on confirm and launch). */
    const val MARK_MS = 560
    val standard = CubicBezierEasing(0.2f, 0f, 0f, 1f)
    val enter = CubicBezierEasing(0f, 0f, 0f, 1f)
    val exit = CubicBezierEasing(0.3f, 0f, 1f, 1f)
    val emphasis = CubicBezierEasing(0.3f, 0f, 0f, 1f)
    /** Transition roles: duration in ms and easing. Use 0 ms when the system "Remove animations" setting is on. */
    val dialogEnter = 200 to enter
    val dialogExit = 120 to exit
    val sheetEnter = 320 to enter
    val sheetExit = 200 to exit
    val select = 120 to standard
    val trackStep = 200 to standard
    val reveal = 200 to enter
    val markFill = 560 to emphasis
}
