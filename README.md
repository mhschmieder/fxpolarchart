# fxpolarchart
JavaFX wrapper for Polar Chart implemented in Swing.

This code was split off from charttoolkit and fxcharttoolkit because it is pretty much a self-contained code set that doesn't use FX Charts due to no polar chart in the core toolkit. Furthermore, most well-known charting toolkits do not handle the specific needs of acoustical polar charts, where amplitude is generally represented in relative terms, meaning negative numbers along the radial axis, which breaks the rules of most charting toolkits' polar chart axes.

The Swing chart basis is several generations removed from a textbook example from someone I was unmable to contact, as so often is the case with ancient freeware that never made it to Maven Central or GitHub. It is only meant as a placeholder anyway, as I hope to find time to replace it with the excellent polar charts that have come along in a couple of third party javaFX libraries in the past two years (somewhere around the 2022 timeframe).

This further justifies a separate library vs. mangling this into the other chart libraries I have published, as it will continue to use a different basis for the actual charting, and the rest of the code is structured around presentation and interaction needs for a full-window application or application secondary visualization window.

The primary view of this library is side-by-side charts of horizontal and vertical polar patterns. These are most useful when examining the characteristic coverage patterns of transducers such as loudspeakers and microphones, but may also be relevant to sonat transmitters and other acoustical devices.

