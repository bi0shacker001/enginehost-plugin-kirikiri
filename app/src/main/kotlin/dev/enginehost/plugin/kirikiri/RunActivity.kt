package dev.enginehost.plugin.kirikiri

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

/**
 * Real, honest current status: this receives enginehost's real "path"
 * extra (and "execFile"/"options" if the game's config had them), but
 * does NOT yet start the vendored vendor/kirikiroid2 engine -- that fork's
 * own real Android entry point (KR2Activity, in
 * com.yuri.kirikiri2/org.tvp.kirikiri2) resolves its game folder through
 * its own internal file-browser flow, not an Intent extra, and the real
 * unlock (how to point its native init at an arbitrary runtime folder
 * instead) hasn't been found yet. This activity is real, and correctly
 * wired into enginehost's own discovery/dispatch (a real installed build
 * of this plugin IS found and invoked by GameRunner), it just doesn't
 * play anything yet.
 */
class RunActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val path = intent.getStringExtra("path")
        setContentView(
            TextView(this).apply {
                text = "enginehost KiriKiri plugin: engine wiring not implemented yet.\nWould run: $path"
            },
        )
    }
}
