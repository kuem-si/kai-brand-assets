// GENERATED from design-tokens/src by tools/foundations (npm run adapters). Do not edit. Values: ADR 0005; chart colours and adapters: ADR 0006; chart scales: ADR 0008 (approved); motion roles: ADR 0009 (approved); breakpoints and elevation: ADR 0014 (approved).
import SwiftUI

/// Colour roles resolved from KaiColors.xcassets (light, dark, Increase Contrast). Status, ai and data roles are protected.
public enum KaiColor {
    public static let brandInk = Color("BrandInk", bundle: .module)
    public static let brandOnInk = Color("BrandOnInk", bundle: .module)
    public static let brandAction = Color("BrandAction", bundle: .module)
    public static let brandActionDark = Color("BrandActionDark", bundle: .module)
    public static let brandMarkDark = Color("BrandMarkDark", bundle: .module)
    public static let brandMark = Color("BrandMark", bundle: .module)
    public static let bgCanvas = Color("BgCanvas", bundle: .module)
    public static let bgSurface = Color("BgSurface", bundle: .module)
    public static let bgSunken = Color("BgSunken", bundle: .module)
    public static let borderSubtle = Color("BorderSubtle", bundle: .module)
    public static let borderStrong = Color("BorderStrong", bundle: .module)
    public static let textDefault = Color("TextDefault", bundle: .module)
    public static let textMuted = Color("TextMuted", bundle: .module)
    public static let textDisabled = Color("TextDisabled", bundle: .module)
    public static let textLink = Color("TextLink", bundle: .module)
    public static let textOnAction = Color("TextOnAction", bundle: .module)
    public static let actionPrimary = Color("ActionPrimary", bundle: .module)
    public static let actionPrimaryHover = Color("ActionPrimaryHover", bundle: .module)
    public static let actionPrimaryPressed = Color("ActionPrimaryPressed", bundle: .module)
    public static let selectionBg = Color("SelectionBg", bundle: .module)
    public static let selectionRule = Color("SelectionRule", bundle: .module)
    public static let focusRing = Color("FocusRing", bundle: .module)
    public static let statusCriticalFg = Color("StatusCriticalFg", bundle: .module)
    public static let statusCriticalBg = Color("StatusCriticalBg", bundle: .module)
    public static let statusCriticalBorder = Color("StatusCriticalBorder", bundle: .module)
    public static let statusWarningFg = Color("StatusWarningFg", bundle: .module)
    public static let statusWarningBg = Color("StatusWarningBg", bundle: .module)
    public static let statusWarningBorder = Color("StatusWarningBorder", bundle: .module)
    public static let statusSuccessFg = Color("StatusSuccessFg", bundle: .module)
    public static let statusSuccessBg = Color("StatusSuccessBg", bundle: .module)
    public static let statusSuccessBorder = Color("StatusSuccessBorder", bundle: .module)
    public static let statusInfoFg = Color("StatusInfoFg", bundle: .module)
    public static let statusInfoBg = Color("StatusInfoBg", bundle: .module)
    public static let statusInfoBorder = Color("StatusInfoBorder", bundle: .module)
    public static let statusNeutralFg = Color("StatusNeutralFg", bundle: .module)
    public static let statusNeutralBg = Color("StatusNeutralBg", bundle: .module)
    public static let statusNeutralBorder = Color("StatusNeutralBorder", bundle: .module)
    public static let aiRequestMarker = Color("AiRequestMarker", bundle: .module)
    public static let aiRequestBorder = Color("AiRequestBorder", bundle: .module)
    public static let aiRequestBg = Color("AiRequestBg", bundle: .module)
    public static let aiContextMarker = Color("AiContextMarker", bundle: .module)
    public static let aiContextBorder = Color("AiContextBorder", bundle: .module)
    public static let aiContextBg = Color("AiContextBg", bundle: .module)
    public static let aiObservedMarker = Color("AiObservedMarker", bundle: .module)
    public static let aiObservedBorder = Color("AiObservedBorder", bundle: .module)
    public static let aiObservedBg = Color("AiObservedBg", bundle: .module)
    public static let aiInferenceMarker = Color("AiInferenceMarker", bundle: .module)
    public static let aiInferenceBorder = Color("AiInferenceBorder", bundle: .module)
    public static let aiInferenceBg = Color("AiInferenceBg", bundle: .module)
    public static let aiEvidenceMarker = Color("AiEvidenceMarker", bundle: .module)
    public static let aiEvidenceBorder = Color("AiEvidenceBorder", bundle: .module)
    public static let aiEvidenceBg = Color("AiEvidenceBg", bundle: .module)
    public static let aiRecommendationMarker = Color("AiRecommendationMarker", bundle: .module)
    public static let aiRecommendationBorder = Color("AiRecommendationBorder", bundle: .module)
    public static let aiRecommendationBg = Color("AiRecommendationBg", bundle: .module)
    public static let aiConfirmedMarker = Color("AiConfirmedMarker", bundle: .module)
    public static let aiConfirmedBorder = Color("AiConfirmedBorder", bundle: .module)
    public static let aiConfirmedBg = Color("AiConfirmedBg", bundle: .module)
    public static let aiTrackLine = Color("AiTrackLine", bundle: .module)
    public static let aiTrackPending = Color("AiTrackPending", bundle: .module)
    public static let aiTrackActive = Color("AiTrackActive", bundle: .module)
    public static let aiTrackDone = Color("AiTrackDone", bundle: .module)
    public static let dataSeries1 = Color("DataSeries1", bundle: .module)
    public static let dataSeries2 = Color("DataSeries2", bundle: .module)
    public static let dataSeries3 = Color("DataSeries3", bundle: .module)
    public static let dataSeries4 = Color("DataSeries4", bundle: .module)
    public static let dataSeries5 = Color("DataSeries5", bundle: .module)
    public static let dataSeries6 = Color("DataSeries6", bundle: .module)
    public static let dataGrid = Color("DataGrid", bundle: .module)
    public static let dataAxis = Color("DataAxis", bundle: .module)
    public static let dataGap = Color("DataGap", bundle: .module)
    public static let dataSeq1 = Color("DataSeq1", bundle: .module)
    public static let dataSeq2 = Color("DataSeq2", bundle: .module)
    public static let dataSeq3 = Color("DataSeq3", bundle: .module)
    public static let dataSeq4 = Color("DataSeq4", bundle: .module)
    public static let dataSeq5 = Color("DataSeq5", bundle: .module)
    public static let dataSeq6 = Color("DataSeq6", bundle: .module)
    public static let dataSeq7 = Color("DataSeq7", bundle: .module)
    public static let dataDiv1 = Color("DataDiv1", bundle: .module)
    public static let dataDiv2 = Color("DataDiv2", bundle: .module)
    public static let dataDiv3 = Color("DataDiv3", bundle: .module)
    public static let dataDiv4 = Color("DataDiv4", bundle: .module)
    public static let dataDiv5 = Color("DataDiv5", bundle: .module)
    public static let dataDiv6 = Color("DataDiv6", bundle: .module)
    public static let dataDiv7 = Color("DataDiv7", bundle: .module)
}

public enum KaiDimens {
    public static let space0: CGFloat = 0
    public static let space25: CGFloat = 1
    public static let space50: CGFloat = 2
    public static let space100: CGFloat = 4
    public static let space150: CGFloat = 6
    public static let space200: CGFloat = 8
    public static let space300: CGFloat = 12
    public static let space400: CGFloat = 16
    public static let space500: CGFloat = 20
    public static let space600: CGFloat = 24
    public static let space800: CGFloat = 32
    public static let space1000: CGFloat = 40
    public static let space1200: CGFloat = 48
    public static let space1600: CGFloat = 64
    public static let radiusNone: CGFloat = 0
    public static let radiusXs: CGFloat = 2
    public static let radiusControl: CGFloat = 6
    public static let radiusCard: CGFloat = 8
    public static let radiusDialog: CGFloat = 12
    public static let radiusFull: CGFloat = 9999
    public static let borderWidthHairline: CGFloat = 1
    public static let borderWidthRule: CGFloat = 2
    public static let borderWidthFocus: CGFloat = 2
    public static let borderWidthFocusHc: CGFloat = 3
    public static let sizeIconSm: CGFloat = 16
    public static let sizeIconMd: CGFloat = 20
    public static let sizeIconLg: CGFloat = 24
    public static let sizeControlSm: CGFloat = 28
    public static let sizeControlMd: CGFloat = 32
    public static let sizeControlLg: CGFloat = 40
    public static let sizeTouchMin: CGFloat = 44
    public static let sizeTrackMarker: CGFloat = 14
    public static let breakpointCompact: CGFloat = 600
    public static let breakpointMedium: CGFloat = 900
    public static let breakpointExpanded: CGFloat = 1200
}

/// Type roles: sizes are Dynamic Type base sizes (scaled with relativeTo).
public enum KaiType {
    public static let caption = Font.custom("IBMPlexSans-Regular", size: 12, relativeTo: .footnote)
    public static let label = Font.custom("IBMPlexSans-SemiBold", size: 12, relativeTo: .footnote)
    public static let bodySm = Font.custom("IBMPlexSans-Regular", size: 13, relativeTo: .footnote)
    public static let body = Font.custom("IBMPlexSans-Regular", size: 14, relativeTo: .callout)
    public static let bodyStrong = Font.custom("IBMPlexSans-SemiBold", size: 14, relativeTo: .callout)
    public static let reading = Font.custom("IBMPlexSans-Regular", size: 16, relativeTo: .body)
    public static let readingStrong = Font.custom("IBMPlexSans-SemiBold", size: 16, relativeTo: .body)
    public static let titleSm = Font.custom("IBMPlexSans-SemiBold", size: 16, relativeTo: .body)
    public static let title = Font.custom("IBMPlexSans-SemiBold", size: 18, relativeTo: .body)
    public static let heading = Font.custom("IBMPlexSans-SemiBold", size: 22, relativeTo: .title)
    public static let display = Font.custom("IBMPlexSans-SemiBold", size: 28, relativeTo: .title)
    public static let displayLg = Font.custom("IBMPlexSans-SemiBold", size: 40, relativeTo: .title)
    public static let data = Font.custom("IBMPlexMono-Regular", size: 13, relativeTo: .footnote)
    public static let dataSm = Font.custom("IBMPlexMono-Regular", size: 12, relativeTo: .footnote)
}

/// Shadow elevation in points (ADR 0014). Use with .shadow(radius:); skip it when colorSchemeContrast is .increased and keep the border.
public enum KaiElevation {
    public static let raised: CGFloat = 3
    public static let overlay: CGFloat = 8
}

/// Motion: durations in seconds and curves. Respect accessibilityReduceMotion by using .none or durations of 0.
public enum KaiMotion {
    public static let fast: Double = 0.12
    public static let base: Double = 0.2
    public static let slow: Double = 0.32
    public static let stepMin: Double = 0.4
    public static let mark: Double = 0.56
    public static func standard(_ duration: Double) -> Animation { .timingCurve(0.2, 0, 0, 1, duration: duration) }
    public static func enter(_ duration: Double) -> Animation { .timingCurve(0, 0, 0, 1, duration: duration) }
    public static func exit(_ duration: Double) -> Animation { .timingCurve(0.3, 0, 1, 1, duration: duration) }
    public static func emphasis(_ duration: Double) -> Animation { .timingCurve(0.3, 0, 0, 1, duration: duration) }
    public static let dialogEnter: Animation = KaiMotion.enter(0.2)
    public static let dialogExit: Animation = KaiMotion.exit(0.12)
    public static let sheetEnter: Animation = KaiMotion.enter(0.32)
    public static let sheetExit: Animation = KaiMotion.exit(0.2)
    public static let select: Animation = KaiMotion.standard(0.12)
    public static let trackStep: Animation = KaiMotion.standard(0.2)
    public static let reveal: Animation = KaiMotion.enter(0.2)
    public static let markFill: Animation = KaiMotion.emphasis(0.56)
}
